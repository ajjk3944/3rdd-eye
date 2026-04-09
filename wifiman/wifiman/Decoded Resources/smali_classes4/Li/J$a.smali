.class public final LLi/J$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LLi/J;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:LLi/J$a;

.field private static final b:LLi/J;

.field private static final c:LLi/J;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LLi/J$a;

    invoke-direct {v0}, LLi/J$a;-><init>()V

    sput-object v0, LLi/J$a;->a:LLi/J$a;

    new-instance v0, LLi/K;

    invoke-direct {v0}, LLi/K;-><init>()V

    sput-object v0, LLi/J$a;->b:LLi/J;

    new-instance v0, LLi/L;

    invoke-direct {v0}, LLi/L;-><init>()V

    sput-object v0, LLi/J$a;->c:LLi/J;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(LLi/J$a;JJILjava/lang/Object;)LLi/J;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    const-wide/16 p1, 0x0

    :cond_0
    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_1

    const-wide p3, 0x7fffffffffffffffL

    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, LLi/J$a;->a(JJ)LLi/J;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(JJ)LLi/J;
    .locals 1

    new-instance v0, LLi/M;

    invoke-direct {v0, p1, p2, p3, p4}, LLi/M;-><init>(JJ)V

    return-object v0
.end method

.method public final c()LLi/J;
    .locals 1

    sget-object v0, LLi/J$a;->b:LLi/J;

    return-object v0
.end method

.method public final d()LLi/J;
    .locals 1

    sget-object v0, LLi/J$a;->c:LLi/J;

    return-object v0
.end method
