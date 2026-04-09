.class public final Lqg/f;
.super Lgg/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/f$a;
    }
.end annotation


# instance fields
.field final b:[LDj/a;

.field final c:Z


# direct methods
.method public constructor <init>([LDj/a;Z)V
    .locals 0

    invoke-direct {p0}, Lgg/i;-><init>()V

    iput-object p1, p0, Lqg/f;->b:[LDj/a;

    iput-boolean p2, p0, Lqg/f;->c:Z

    return-void
.end method


# virtual methods
.method protected E1(LDj/b;)V
    .locals 3

    new-instance v0, Lqg/f$a;

    iget-object v1, p0, Lqg/f;->b:[LDj/a;

    iget-boolean v2, p0, Lqg/f;->c:Z

    invoke-direct {v0, v1, v2, p1}, Lqg/f$a;-><init>([LDj/a;ZLDj/b;)V

    invoke-interface {p1, v0}, LDj/b;->j(LDj/c;)V

    invoke-virtual {v0}, Lqg/f$a;->a()V

    return-void
.end method
