.class abstract LGg/a$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LGg/a;
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

    new-instance v0, Lwg/f;

    invoke-direct {v0}, Lwg/f;-><init>()V

    sput-object v0, LGg/a$d;->a:Lgg/y;

    return-void
.end method
