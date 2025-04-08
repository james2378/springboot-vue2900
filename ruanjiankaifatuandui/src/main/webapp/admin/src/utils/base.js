const base = {
    get() {
        return {
            url : "http://localhost:8080/ruanjiankaifatuandui/",
            name: "ruanjiankaifatuandui",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ruanjiankaifatuandui/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "软件开发团队管理网站"
        } 
    }
}
export default base
