.class final Lo8/d$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo8/d;-><init>(Lgd/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lo8/d$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo8/d$e;

    invoke-direct {v0}, Lo8/d$e;-><init>()V

    sput-object v0, Lo8/d$e;->a:Lo8/d$e;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)LKe/m;
    .locals 2

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lgd/g$b;

    if-nez p1, :cond_0

    sget-object p1, LKe/m$b;->a:LKe/m$b;

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lgd/g$b$b;

    if-eqz v0, :cond_1

    check-cast p1, Lgd/g$b$b;

    invoke-virtual {p1}, Lgd/g$b$b;->d()I

    move-result v0

    invoke-virtual {p1}, Lgd/g$b$b;->c()F

    move-result p1

    new-instance v1, LKe/m$c;

    invoke-direct {v1, p1, v0}, LKe/m$c;-><init>(FI)V

    move-object p1, v1

    goto :goto_0

    :cond_1
    instance-of p1, p1, Lgd/g$b$a;

    if-eqz p1, :cond_2

    sget-object p1, LKe/m$a;->a:LKe/m$a;

    :goto_0
    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, Lo8/d$e;->a(Ll9/a;)LKe/m;

    move-result-object p1

    return-object p1
.end method
