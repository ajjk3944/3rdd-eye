.class public final LJ7/F$b$a$b$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ7/F$b$a$b;->a(Lgg/i;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/N;

.field final synthetic b:J


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/N;J)V
    .locals 0

    iput-object p1, p0, LJ7/F$b$a$b$a;->a:Lkotlin/jvm/internal/N;

    iput-wide p2, p0, LJ7/F$b$a$b$a;->b:J

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)LDj/a;
    .locals 2

    iget-object v0, p0, LJ7/F$b$a$b$a;->a:Lkotlin/jvm/internal/N;

    iput-object p1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    instance-of v0, p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error;

    if-eqz v0, :cond_0

    invoke-static {p1}, Lgg/i;->k0(Ljava/lang/Throwable;)Lgg/i;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Ljava/io/IOException;

    if-eqz v0, :cond_1

    iget-wide v0, p0, LJ7/F$b$a$b$a;->b:J

    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v0, v1, p1}, Lgg/i;->d2(JLjava/util/concurrent/TimeUnit;)Lgg/i;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lgg/i;->k0(Ljava/lang/Throwable;)Lgg/i;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LJ7/F$b$a$b$a;->a(Ljava/lang/Throwable;)LDj/a;

    move-result-object p1

    return-object p1
.end method
