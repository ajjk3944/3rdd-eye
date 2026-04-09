.class public interface abstract LXd/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\'\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0004H\'\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u000bH\'\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "LXd/a;",
        "",
        "LYd/a;",
        "params",
        "Lgg/z;",
        "LYd/b;",
        "c",
        "(LYd/a;)Lgg/z;",
        "LYd/d;",
        "a",
        "()Lgg/z;",
        "LYd/e;",
        "Lgg/b;",
        "b",
        "(LYd/e;)Lgg/b;",
        "app-model_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract a()Lgg/z;
    .annotation runtime LRj/f;
        value = "/nms/api/v2.1/nms/info"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lgg/z<",
            "LYd/d;",
            ">;"
        }
    .end annotation
.end method

.method public abstract b(LYd/e;)Lgg/b;
    .param p1    # LYd/e;
        .annotation runtime LRj/a;
        .end annotation
    .end param
    .annotation runtime LRj/o;
        value = "/nms/api/v2.1/nms/speed/report"
    .end annotation
.end method

.method public abstract c(LYd/a;)Lgg/z;
    .param p1    # LYd/a;
        .annotation runtime LRj/a;
        .end annotation
    .end param
    .annotation runtime LRj/o;
        value = "/nms/api/v2.1/nms/info/login"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYd/a;",
            ")",
            "Lgg/z<",
            "LYd/b;",
            ">;"
        }
    .end annotation
.end method
