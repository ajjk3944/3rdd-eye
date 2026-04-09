.class final Lp8/i$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp8/i;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lp8/i$j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lp8/i$j;

    invoke-direct {v0}, Lp8/i$j;-><init>()V

    sput-object v0, Lp8/i$j;->a:Lp8/i$j;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lp8/i$b;)LDj/a;
    .locals 2

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lp8/i$b$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lp8/i$b$a;

    invoke-virtual {v0}, Lp8/i$b$a;->a()LLe/a$a;

    move-result-object v0

    instance-of v0, v0, LLe/a$a$e;

    if-eqz v0, :cond_0

    const-wide/16 v0, 0xbb8

    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v0, v1, p1}, Lgg/i;->d2(JLjava/util/concurrent/TimeUnit;)Lgg/i;

    move-result-object p1

    sget-object v0, Lp8/i$j$a;->a:Lp8/i$j$a;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    sget-object v0, Lp8/i$b$b;->a:Lp8/i$b$b;

    invoke-virtual {p1, v0}, Lgg/i;->z1(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lp8/i$b;

    invoke-virtual {p0, p1}, Lp8/i$j;->a(Lp8/i$b;)LDj/a;

    move-result-object p1

    return-object p1
.end method
