File encoding has not been set, using platform encoding GBK,

解决：

---
解决MAVEN项目打包后提示没有主清单属性解决方案：
https://blog.csdn.net/weixin_44109652/article/details/122860081?utm_medium=distribute.pc_aggpage_search_result.none-task-blog-2~aggregatepage~first_rank_ecpm_v1~rank_v31_ecpm-2-122860081.pc_agg_new_rank&utm_term=maven%E9%A1%B9%E7%9B%AE%E4%B8%AD%E6%B2%A1%E6%9C%89%E4%B8%BB%E6%B8%85%E5%8D%95%E5%B1%9E%E6%80%A7mainClass&spm=1000.2123.3001.4430

---


---
解决：14:29:42.546: [javaLearnCode] git -c credential.helper= -c core.quotepath=false -c log.showSignature=false push --progress --porcelain origin refs/heads/main:main --follow-tags
XML error: no element found
error: no DAV locking support on https://github.com/ling0900/javaLearnCode.git/
fatal: git-http-push failed
error: failed to push some refs to 'https://github.com/ling0900/javaLearnCode.git'
方案：


git config --global --unset http.proxy
