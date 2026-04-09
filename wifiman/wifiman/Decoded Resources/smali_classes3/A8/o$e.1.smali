.class final LA8/o$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA8/o;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LA8/o$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LA8/o$e;

    invoke-direct {v0}, LA8/o$e;-><init>()V

    sput-object v0, LA8/o$e;->a:LA8/o$e;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Le7/g;)LDj/a;
    .locals 3

    const-string/jumbo v0, "trackingState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Le7/g$a;

    const-string/jumbo v1, "just(...)"

    if-nez v0, :cond_8

    instance-of v0, p1, Le7/g$b$b;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Le7/g$b$c;

    if-eqz v0, :cond_1

    const-wide/16 v0, 0x3

    sget-object p1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v0, v1, p1}, Lgg/i;->d2(JLjava/util/concurrent/TimeUnit;)Lgg/i;

    move-result-object p1

    sget-object v0, LA8/o$e$a;->a:LA8/o$e$a;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    new-instance v0, Ll9/a;

    sget-object v1, LYe/c$a$a;->a:LYe/c$a$a;

    invoke-direct {v0, v1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Lgg/i;->z1(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "startWithItem(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_2

    :cond_1
    instance-of v0, p1, Le7/g$b$a;

    if-eqz v0, :cond_7

    new-instance v0, Ll9/a;

    check-cast p1, Le7/g$b$a;

    instance-of v2, p1, Le7/g$b$a$c;

    if-eqz v2, :cond_2

    sget-object p1, LYe/c$b$c;->a:LYe/c$b$c;

    goto :goto_0

    :cond_2
    instance-of v2, p1, Le7/g$b$a$d;

    if-eqz v2, :cond_3

    sget-object p1, LYe/c$b$d;->a:LYe/c$b$d;

    goto :goto_0

    :cond_3
    instance-of v2, p1, Le7/g$b$a$b;

    if-eqz v2, :cond_4

    sget-object p1, LYe/c$b$b;->a:LYe/c$b$b;

    goto :goto_0

    :cond_4
    instance-of v2, p1, Le7/g$b$a$a;

    if-eqz v2, :cond_5

    sget-object p1, LYe/c$b$a;->a:LYe/c$b$a;

    goto :goto_0

    :cond_5
    instance-of p1, p1, Le7/g$b$a$e;

    if-eqz p1, :cond_6

    sget-object p1, LYe/c$b$e;->a:LYe/c$b$e;

    :goto_0
    invoke-direct {v0, p1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-static {v0}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_2

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_8
    :goto_1
    new-instance p1, Ll9/a;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_2
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le7/g;

    invoke-virtual {p0, p1}, LA8/o$e;->a(Le7/g;)LDj/a;

    move-result-object p1

    return-object p1
.end method
