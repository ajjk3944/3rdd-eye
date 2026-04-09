.class final Lcom/ui/wmw/wifi/b$c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wmw/wifi/b$c;->a(Lcom/ui/wmw/api/v1/b$e;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LKf/e;


# direct methods
.method constructor <init>(LKf/e;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wmw/wifi/b$c$b;->a:LKf/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)Lgg/D;
    .locals 10

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wmw/wifi/b$c$b;->a:LKf/e;

    invoke-virtual {v0}, LKf/e;->m()Lcom/ui/common/semver/SemVer;

    move-result-object v0

    new-instance v9, Lcom/ui/common/semver/SemVer;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v2, 0x1

    const/16 v3, 0x8

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, v9

    invoke-direct/range {v1 .. v8}, Lcom/ui/common/semver/SemVer;-><init>(IIILjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v9}, Lcom/ui/common/semver/SemVer;->a(Lcom/ui/common/semver/SemVer;)I

    move-result v0

    if-gez v0, :cond_0

    instance-of v0, p1, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/ui/wmw/wifi/b$c$b$b;

    invoke-direct {v0, p1}, Lcom/ui/wmw/wifi/b$c$b$b;-><init>(Ljava/lang/Throwable;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Lgg/z;->z(Ljava/lang/Object;)Lgg/z;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/b;->k(Lgg/D;)Lgg/z;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/ui/wmw/WMWizard$Error$Session$RequestTimeout;

    if-eqz v0, :cond_1

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object p1

    invoke-static {p1}, Lgg/z;->z(Ljava/lang/Object;)Lgg/z;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lgg/z;->p(Ljava/lang/Throwable;)Lgg/z;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lcom/ui/wmw/wifi/b$c$b;->a(Ljava/lang/Throwable;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
