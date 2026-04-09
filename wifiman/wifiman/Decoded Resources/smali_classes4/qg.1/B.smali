.class public final Lqg/B;
.super Lgg/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/B$a;,
        Lqg/B$b;,
        Lqg/B$c;
    }
.end annotation


# instance fields
.field final b:[Ljava/lang/Object;


# direct methods
.method public constructor <init>([Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Lgg/i;-><init>()V

    iput-object p1, p0, Lqg/B;->b:[Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public E1(LDj/b;)V
    .locals 3

    instance-of v0, p1, LDg/a;

    if-eqz v0, :cond_0

    new-instance v0, Lqg/B$a;

    move-object v1, p1

    check-cast v1, LDg/a;

    iget-object v2, p0, Lqg/B;->b:[Ljava/lang/Object;

    invoke-direct {v0, v1, v2}, Lqg/B$a;-><init>(LDg/a;[Ljava/lang/Object;)V

    invoke-interface {p1, v0}, LDj/b;->j(LDj/c;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lqg/B$b;

    iget-object v1, p0, Lqg/B;->b:[Ljava/lang/Object;

    invoke-direct {v0, p1, v1}, Lqg/B$b;-><init>(LDj/b;[Ljava/lang/Object;)V

    invoke-interface {p1, v0}, LDj/b;->j(LDj/c;)V

    :goto_0
    return-void
.end method
