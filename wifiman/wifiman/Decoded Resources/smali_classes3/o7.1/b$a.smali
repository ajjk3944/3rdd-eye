.class public final Lo7/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo7/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Lo7/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo7/b$a;

    invoke-direct {v0}, Lo7/b$a;-><init>()V

    sput-object v0, Lo7/b$a;->a:Lo7/b$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Lo7/q;)Lo7/b;
    .locals 1

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "systemInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lo7/e;

    invoke-direct {v0, p1, p2}, Lo7/e;-><init>(Landroid/content/Context;Lo7/q;)V

    return-object v0
.end method
