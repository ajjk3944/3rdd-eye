.class public final LR0/c0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LR0/c0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:LR0/c0$a;

.field private static final b:LR0/c0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LR0/c0$a;

    invoke-direct {v0}, LR0/c0$a;-><init>()V

    sput-object v0, LR0/c0$a;->a:LR0/c0$a;

    new-instance v0, LR0/b0;

    invoke-direct {v0}, LR0/b0;-><init>()V

    sput-object v0, LR0/c0$a;->b:LR0/c0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LL0/d;)LR0/a0;
    .locals 0

    invoke-static {p0}, LR0/c0$a;->b(LL0/d;)LR0/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final b(LL0/d;)LR0/a0;
    .locals 2

    new-instance v0, LR0/a0;

    sget-object v1, LR0/H;->a:LR0/H$a;

    invoke-virtual {v1}, LR0/H$a;->a()LR0/H;

    move-result-object v1

    invoke-direct {v0, p0, v1}, LR0/a0;-><init>(LL0/d;LR0/H;)V

    return-object v0
.end method


# virtual methods
.method public final c()LR0/c0;
    .locals 1

    sget-object v0, LR0/c0$a;->b:LR0/c0;

    return-object v0
.end method
