.class final Lad/f$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lad/f;-><init>(Lad/a;LYc/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lad/f$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lad/f$c;

    invoke-direct {v0}, Lad/f$c;-><init>()V

    sput-object v0, Lad/f$c;->a:Lad/f$c;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/LinkedList;Lad/a$a;)Ljava/util/LinkedList;
    .locals 6

    const-string v0, "result"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    instance-of v2, p2, Lad/a$a$b;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    sget-object v2, Lb8/b;->a:Lb8/b$b;

    check-cast p2, Lad/a$a$b;

    invoke-virtual {p2}, Lad/a$a$b;->a()I

    move-result p2

    invoke-virtual {v2, p2}, Lb8/b$b;->a(I)Lb8/b;

    move-result-object p2

    goto :goto_0

    :cond_0
    instance-of p2, p2, Lad/a$a$a;

    if-eqz p2, :cond_5

    move-object p2, v3

    :goto_0
    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lb8/b;->b()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    :cond_1
    if-eqz v3, :cond_2

    invoke-virtual {p2}, Lb8/b;->b()I

    move-result v2

    int-to-long v2, v2

    const-wide/16 v4, 0x1388

    cmp-long v2, v2, v4

    if-lez v2, :cond_2

    invoke-virtual {p2}, Lb8/b;->b()I

    move-result v2

    int-to-long v2, v2

    const-wide/16 v4, 0x1450

    cmp-long v2, v2, v4

    if-ltz v2, :cond_3

    :cond_2
    new-instance v2, LWc/c;

    invoke-direct {v2, v0, v1, p2}, LWc/c;-><init>(JLjava/lang/Object;)V

    invoke-virtual {p1, v2}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    :cond_3
    :goto_1
    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_4

    invoke-virtual {p1}, Ljava/util/LinkedList;->getFirst()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LWc/c;

    invoke-virtual {p2}, LWc/c;->c()J

    move-result-wide v2

    const p2, 0x88b8

    int-to-long v4, p2

    sub-long v4, v0, v4

    cmp-long p2, v2, v4

    if-gez p2, :cond_4

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Ljava/util/LinkedList;->remove(I)Ljava/lang/Object;

    goto :goto_1

    :cond_4
    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/LinkedList;

    check-cast p2, Lad/a$a;

    invoke-virtual {p0, p1, p2}, Lad/f$c;->a(Ljava/util/LinkedList;Lad/a$a;)Ljava/util/LinkedList;

    move-result-object p1

    return-object p1
.end method
