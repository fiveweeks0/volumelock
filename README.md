# 하민이 볼륨 고정 앱 (VolumeLock)

미디어 볼륨을 항상 3으로 고정하는 Android 앱입니다.

## 기능
- 앱 실행 시 즉시 미디어 볼륨 3으로 설정
- 볼륨 버튼 누르면 즉시 3으로 복원
- 백그라운드 서비스로 상시 실행 (스와이프로 종료 불가)
- 패드 재부팅 시 자동 시작
- 서비스 강제 종료 시 자동 재시작

## 빌드 방법 (Android Studio)

1. Android Studio 최신 버전 설치
   https://developer.android.com/studio

2. 이 프로젝트 폴더를 열기
   File → Open → VolumeLock 폴더 선택

3. Gradle Sync 대기

4. APK 빌드
   Build → Build Bundle(s) / APK(s) → Build APK(s)

5. APK 위치
   app/build/outputs/apk/debug/app-debug.apk

## 패드 설치 방법

### 방법 A: ADB (USB)
```bash
adb install app-debug.apk
```

### 방법 B: 파일 전송
1. APK 파일을 패드로 복사 (USB, 메일, 드라이브 등)
2. 패드 설정 → 보안 → 알 수 없는 앱 설치 허용
3. 파일 관리자에서 APK 실행

## 설치 후

1. 앱 실행
2. 앱 닫기 (백그라운드에서 계속 실행됨)
3. 볼륨 변경 시도 → 자동으로 3으로 복원됨

## 볼륨 값 변경하려면

VolumeLockService.java 와 MainActivity.java 에서
`TARGET_VOLUME = 3` 값을 원하는 숫자로 바꾸고 재빌드

## 최소 Android 버전
Android 5.0 (Lollipop) 이상
