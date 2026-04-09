.class final Lba/t$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lba/t;->K0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lba/t;


# direct methods
.method constructor <init>(Lba/t;)V
    .locals 0

    iput-object p1, p0, Lba/t$b;->a:Lba/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lba/t$a;)Lgg/f;
    .locals 1

    sget-object v0, Lba/t$a$a;->a:Lba/t$a$a;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lba/t$b;->a:Lba/t;

    invoke-static {p1}, Lba/t;->G0(Lba/t;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lba/t$a$b;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lba/t$b;->a:Lba/t;

    check-cast p1, Lba/t$a$b;

    invoke-virtual {p1}, Lba/t$a$b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lba/t;->J0(Lba/t;Ljava/lang/String;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_1
    sget-object v0, Lba/t$a$c;->a:Lba/t$a$c;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object p1, p0, Lba/t$b;->a:Lba/t;

    invoke-static {p1}, Lba/t;->H0(Lba/t;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_2
    sget-object v0, Lba/t$a$d;->a:Lba/t$a$d;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lba/t$b;->a:Lba/t;

    invoke-static {p1}, Lba/t;->I0(Lba/t;)Lgg/b;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lba/t$a;

    invoke-virtual {p0, p1}, Lba/t$b;->a(Lba/t$a;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
