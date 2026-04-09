.class final Lo5/x$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo5/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "d"
.end annotation


# static fields
.field public static final a:Lo5/x$d;

.field private static final b:LR1/d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo5/x$d;

    invoke-direct {v0}, Lo5/x$d;-><init>()V

    sput-object v0, Lo5/x$d;->a:Lo5/x$d;

    const-string/jumbo v0, "session_id"

    invoke-static {v0}, LR1/f;->f(Ljava/lang/String;)LR1/d$a;

    move-result-object v0

    sput-object v0, Lo5/x$d;->b:LR1/d$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LR1/d$a;
    .locals 1

    sget-object v0, Lo5/x$d;->b:LR1/d$a;

    return-object v0
.end method
