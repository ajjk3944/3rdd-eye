.class abstract LGg/a$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LGg/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "e"
.end annotation


# static fields
.field static final a:Lgg/y;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lwg/g;

    invoke-direct {v0}, Lwg/g;-><init>()V

    sput-object v0, LGg/a$e;->a:Lgg/y;

    return-void
.end method
