.class public final LBh/v0$i;
.super LBh/w0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LBh/v0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "i"
.end annotation


# static fields
.field public static final c:LBh/v0$i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LBh/v0$i;

    invoke-direct {v0}, LBh/v0$i;-><init>()V

    sput-object v0, LBh/v0$i;->c:LBh/v0$i;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    const-string v0, "unknown"

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, LBh/w0;-><init>(Ljava/lang/String;Z)V

    return-void
.end method
