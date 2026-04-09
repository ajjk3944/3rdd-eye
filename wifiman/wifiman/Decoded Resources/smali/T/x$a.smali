.class public final LT/x$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LT/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:LT/x$a;

.field private static final b:LT/x;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LT/x$a;

    invoke-direct {v0}, LT/x$a;-><init>()V

    sput-object v0, LT/x$a;->a:LT/x$a;

    invoke-static {}, Lb0/f;->a()Lb0/e;

    move-result-object v0

    sput-object v0, LT/x$a;->b:LT/x;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LT/x;
    .locals 1

    sget-object v0, LT/x$a;->b:LT/x;

    return-object v0
.end method
