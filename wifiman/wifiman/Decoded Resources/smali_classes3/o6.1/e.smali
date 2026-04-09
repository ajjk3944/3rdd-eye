.class public final Lo6/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lo6/e;

.field private static final b:Lp6/d;

.field private static final c:Lo6/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo6/e;

    invoke-direct {v0}, Lo6/e;-><init>()V

    sput-object v0, Lo6/e;->a:Lo6/e;

    const/16 v1, 0x32

    invoke-virtual {v0, v1}, Lo6/e;->c(I)Lp6/d;

    move-result-object v0

    sput-object v0, Lo6/e;->b:Lp6/d;

    new-instance v0, Lo6/e$a;

    invoke-direct {v0}, Lo6/e$a;-><init>()V

    sput-object v0, Lo6/e;->c:Lo6/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lp6/d;
    .locals 1

    sget-object v0, Lo6/e;->b:Lp6/d;

    return-object v0
.end method

.method public final b()Lo6/c;
    .locals 1

    sget-object v0, Lo6/e;->c:Lo6/c;

    return-object v0
.end method

.method public final c(I)Lp6/d;
    .locals 0

    invoke-virtual {p0, p1, p1, p1, p1}, Lo6/e;->d(IIII)Lp6/d;

    move-result-object p1

    return-object p1
.end method

.method public final d(IIII)Lp6/d;
    .locals 3

    new-instance v0, Lp6/d;

    new-instance v1, Lp6/a$b;

    sget-object v2, Lp6/e;->a:Lp6/e;

    invoke-direct {v1, p1, v2}, Lp6/a$b;-><init>(ILp6/c;)V

    new-instance p1, Lp6/a$b;

    invoke-direct {p1, p2, v2}, Lp6/a$b;-><init>(ILp6/c;)V

    new-instance p2, Lp6/a$b;

    invoke-direct {p2, p3, v2}, Lp6/a$b;-><init>(ILp6/c;)V

    new-instance p3, Lp6/a$b;

    invoke-direct {p3, p4, v2}, Lp6/a$b;-><init>(ILp6/c;)V

    invoke-direct {v0, v1, p1, p2, p3}, Lp6/d;-><init>(Lp6/a;Lp6/a;Lp6/a;Lp6/a;)V

    return-object v0
.end method
