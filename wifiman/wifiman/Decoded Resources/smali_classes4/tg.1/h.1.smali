.class public final Ltg/h;
.super Ltg/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltg/h$a;,
        Ltg/h$b;
    }
.end annotation


# instance fields
.field final b:J

.field final c:Ljava/util/concurrent/TimeUnit;

.field final d:Lgg/y;

.field final e:Lkg/f;


# direct methods
.method public constructor <init>(Lgg/v;JLjava/util/concurrent/TimeUnit;Lgg/y;Lkg/f;)V
    .locals 0

    invoke-direct {p0, p1}, Ltg/a;-><init>(Lgg/v;)V

    iput-wide p2, p0, Ltg/h;->b:J

    iput-object p4, p0, Ltg/h;->c:Ljava/util/concurrent/TimeUnit;

    iput-object p5, p0, Ltg/h;->d:Lgg/y;

    iput-object p6, p0, Ltg/h;->e:Lkg/f;

    return-void
.end method


# virtual methods
.method public L0(Lgg/x;)V
    .locals 9

    iget-object v0, p0, Ltg/a;->a:Lgg/v;

    new-instance v8, Ltg/h$b;

    new-instance v2, LCg/c;

    invoke-direct {v2, p1}, LCg/c;-><init>(Lgg/x;)V

    iget-wide v3, p0, Ltg/h;->b:J

    iget-object v5, p0, Ltg/h;->c:Ljava/util/concurrent/TimeUnit;

    iget-object p1, p0, Ltg/h;->d:Lgg/y;

    invoke-virtual {p1}, Lgg/y;->c()Lgg/y$c;

    move-result-object v6

    iget-object v7, p0, Ltg/h;->e:Lkg/f;

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, Ltg/h$b;-><init>(Lgg/x;JLjava/util/concurrent/TimeUnit;Lgg/y$c;Lkg/f;)V

    invoke-interface {v0, v8}, Lgg/v;->d(Lgg/x;)V

    return-void
.end method
