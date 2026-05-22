package com.hamin.volumelock;

import android.content.Intent;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final int TARGET_VOLUME = 3;

        @Override
            protected void onCreate(Bundle savedInstanceState) {
                    super.onCreate(savedInstanceState);
                            setContentView(R.layout.activity_main);

                                    AudioManager audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
                                            if (audioManager != null) {
                                                        audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, TARGET_VOLUME, 0);
                                                                }

                                                                        startVolumeLockService();

                                                                                TextView tvStatus = findViewById(R.id.tvStatus);
                                                                                        tvStatus.setText("미디어 볼륨 " + TARGET_VOLUME + " 고정 중");
                                                                                            }

                                                                                                private void startVolumeLockService() {
                                                                                                        Intent serviceIntent = new Intent(this, VolumeLockService.class);
                                                                                                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                                                                                                                            startForegroundService(serviceIntent);
                                                                                                                                    } else {
                                                                                                                                                startService(serviceIntent);
                                                                                                                                                        }
                                                                                                                                                            }

                                                                                                                                                                @Override
                                                                                                                                                                    protected void onResume() {
                                                                                                                                                                            super.onResume();
                                                                                                                                                                                    AudioManager audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
                                                                                                                                                                                            if (audioManager != null) {
                                                                                                                                                                                                        audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, TARGET_VOLUME, 0);
                                                                                                                                                                                                                }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    }