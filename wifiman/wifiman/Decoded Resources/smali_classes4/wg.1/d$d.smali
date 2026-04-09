.class abstract Lwg/d$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwg/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "d"
.end annotation


# static fields
.field static final a:Lgg/y;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, LGg/a;->e()Lgg/y;

    move-result-object v0

    sput-object v0, Lwg/d$d;->a:Lgg/y;

    return-void
.end method
