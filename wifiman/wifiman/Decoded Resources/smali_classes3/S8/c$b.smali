.class final LS8/c$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS8/c;-><init>(Ljava/lang/String;ILjava/util/Set;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LS8/c$b$a;
    }
.end annotation


# instance fields
.field final synthetic a:LS8/c;


# direct methods
.method constructor <init>(LS8/c;)V
    .locals 0

    iput-object p1, p0, LS8/c$b;->a:LS8/c;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Set;
    .locals 3

    iget-object v0, p0, LS8/c$b;->a:LS8/c;

    sget-object v1, LS8/c$b$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LS8/c$b;->a:LS8/c;

    sget-object v1, LS8/c;->GHZ_6:LS8/c;

    sget-object v2, LKb/a$a;->e:LKb/a$a$a;

    invoke-virtual {v2}, LKb/a$a$a;->c()Ljava/util/Set;

    move-result-object v2

    invoke-static {v0, v1, v2}, LS8/c;->access$getChannelList(LS8/c;LS8/c;Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1
    iget-object v0, p0, LS8/c$b;->a:LS8/c;

    sget-object v1, LS8/c;->GHZ_5:LS8/c;

    sget-object v2, LKb/a$a;->e:LKb/a$a$a;

    invoke-virtual {v2}, LKb/a$a$a;->b()Ljava/util/Set;

    move-result-object v2

    invoke-static {v0, v1, v2}, LS8/c;->access$getChannelList(LS8/c;LS8/c;Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    goto :goto_0

    :cond_2
    iget-object v0, p0, LS8/c$b;->a:LS8/c;

    sget-object v1, LS8/c;->GHZ_2_4:LS8/c;

    sget-object v2, LKb/a$a;->e:LKb/a$a$a;

    invoke-virtual {v2}, LKb/a$a$a;->a()Ljava/util/Set;

    move-result-object v2

    invoke-static {v0, v1, v2}, LS8/c;->access$getChannelList(LS8/c;LS8/c;Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LS8/c$b;->a()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
