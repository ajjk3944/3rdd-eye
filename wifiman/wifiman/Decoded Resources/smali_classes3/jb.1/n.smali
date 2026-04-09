.class public interface abstract Ljb/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0003\u0010\u0003\u001a\u00020\u0002H\'\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J!\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\t0\u00080\u0004H\'\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Ljb/n;",
        "",
        "Llb/d;",
        "createCredentials",
        "Lgg/z;",
        "Llb/b;",
        "b",
        "(Llb/d;)Lgg/z;",
        "",
        "Llb/h;",
        "Lmb/y;",
        "a",
        "()Lgg/z;",
        "unificore_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract a()Lgg/z;
    .annotation runtime LRj/f;
        value = "/devices?type=ucore&withUserData=true"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lgg/z<",
            "Ljava/util/List<",
            "Llb/h<",
            "Lmb/y;",
            ">;>;>;"
        }
    .end annotation
.end method

.method public abstract b(Llb/d;)Lgg/z;
    .param p1    # Llb/d;
        .annotation runtime LRj/a;
        .end annotation
    .end param
    .annotation runtime LRj/o;
        value = "/create-credentials"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llb/d;",
            ")",
            "Lgg/z<",
            "Llb/b;",
            ">;"
        }
    .end annotation
.end method
