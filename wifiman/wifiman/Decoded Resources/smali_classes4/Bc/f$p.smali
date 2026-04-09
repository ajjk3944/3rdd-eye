.class final LBc/f$p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LBc/f;->A(Lgg/i;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LBc/f$p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LBc/f$p;

    invoke-direct {v0}, LBc/f$p;-><init>()V

    sput-object v0, LBc/f$p;->a:LBc/f$p;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LBc/a$a;LYg/y;)LBc/a$a;
    .locals 10

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<destruct>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, LYg/y;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LBc/f$b$b;

    invoke-virtual {p2}, LYg/y;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LBc/f$b$c;

    invoke-virtual {p2}, LYg/y;->d()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LBc/f$b$a;

    invoke-virtual {v1}, LBc/f$b$c;->a()Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {p2}, LBc/f$b$a;->a()LV7/b;

    move-result-object v3

    instance-of v4, v3, LV7/b$a;

    if-nez v4, :cond_2

    instance-of v4, v3, LV7/b$b;

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    instance-of v4, v3, LV7/b$c;

    if-nez v4, :cond_1

    instance-of v3, v3, LV7/b$d;

    if-eqz v3, :cond_3

    :cond_1
    sget-object v2, LV7/a$b;->e:LV7/a$b$a;

    invoke-virtual {v2, v1}, LV7/a$b$a;->a(I)LV7/a$b;

    move-result-object v2

    goto :goto_1

    :cond_2
    :goto_0
    sget-object v2, LV7/a$a;->e:LV7/a$a$a;

    invoke-virtual {v2, v1}, LV7/a$a$a;->a(I)LV7/a$a;

    move-result-object v2

    :cond_3
    :goto_1
    invoke-virtual {v0}, LBc/f$b$b;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, LBc/f$b$a;->a()LV7/b;

    move-result-object p2

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {p1}, LBc/a$a;->b()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LBc/a$a$a;

    invoke-virtual {v5}, LBc/a$a$a;->b()J

    move-result-wide v6

    const-wide/32 v8, 0xea60

    sub-long v8, v3, v8

    cmp-long v6, v6, v8

    if-lez v6, :cond_4

    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    new-instance p1, LBc/a$a$a;

    invoke-direct {p1, v2, v3, v4}, LBc/a$a$a;-><init>(LV7/a;J)V

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object p1, LYg/J;->a:LYg/J;

    new-instance p1, LBc/a$a;

    invoke-direct {p1, v0, v2, p2, v1}, LBc/a$a;-><init>(Ljava/lang/String;LV7/a;LV7/b;Ljava/util/List;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LBc/a$a;

    check-cast p2, LYg/y;

    invoke-virtual {p0, p1, p2}, LBc/f$p;->a(LBc/a$a;LYg/y;)LBc/a$a;

    move-result-object p1

    return-object p1
.end method
