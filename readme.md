# 视频播放器组件版本发布


## 1.0.5

引擎实现

1. 使用android系统原生的MediaPlayer作为播放器的引擎
2. 支持播放、暂停、跳转、手势等组件基本动作
3. 增加视频引擎管理器，由项目引入库决定使用哪种引擎。
4. 插件框架增加背景阴影属性

## 1.0.3

字幕及外围功能

1. 增加srt字幕功能插件
2. 增加后台下载字幕功能
3. 增加网络状态变化监听插件
4. 增加低网速插件功能
5. 增加字幕切换、缩放比率切换、播放速度切换功能

## 1.0.1

二分屏功能

1. 开发视频内文档插件，支持接入阅读器组件、文档翻页插件、文档同步功能
2. 支持单屏、多屏切换
3. 接入阅读器组件
4. 增加延时加载文档功能


## 1.0.2

习题插件功能

1. 分离原非学历项目中的习题插件部分，整合成新的习题插件组件
2. 标准化习题插件的入口：加载并打开习题
3. 增加习题插件的通信接口
4. 增加延时加载习题功能

## 1.0.0

该版本开发视频播放器的主要功能

1. 使用新的插件框架重构视频播放器
2. 调整视频组件的结构：分离引擎并标准化
2. 支持mp3、flv、f4v的基础视频格式播放
3. 支持手势操作调节音量、亮度
4. 自动跳转到上次播放位置功能
5. 调整vlc-jni部分代码，更符合hy项目结构
6. 重新归类视频的消息事件（分为：准备状态、播放、暂停、完成四类）