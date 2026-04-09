.class final LP8/g$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP8/g;->l(Lgg/i;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP8/g$c$a;
    }
.end annotation


# static fields
.field public static final a:LP8/g$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LP8/g$c;

    invoke-direct {v0}, LP8/g$c;-><init>()V

    sput-object v0, LP8/g$c;->a:LP8/g$c;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/s;LIf/a;)LYg/s;
    .locals 4

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "current"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LIf/a;

    sget-object v0, LP8/g$c$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const-wide/16 v1, 0xbb8

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-wide/16 v2, 0x0

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    packed-switch v0, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    sget-object v0, LIf/a;->CONNECTING:LIf/a;

    if-ne p1, v0, :cond_0

    const-wide/16 v0, 0x7d0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-static {p2, p1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {p2, v2}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p1

    goto :goto_0

    :pswitch_1
    sget-object v0, LIf/a;->DISCOVERING:LIf/a;

    if-ne p1, v0, :cond_1

    invoke-static {p2, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-static {p2, v2}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p1

    goto :goto_0

    :pswitch_2
    sget-object v0, LIf/a;->FW_UPDATE_PROGRESS:LIf/a;

    if-ne p1, v0, :cond_2

    invoke-static {p2, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p1

    goto :goto_0

    :cond_2
    invoke-static {p2, v2}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p1

    goto :goto_0

    :pswitch_3
    invoke-static {p2, v2}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p1

    :goto_0
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/s;

    check-cast p2, LIf/a;

    invoke-virtual {p0, p1, p2}, LP8/g$c;->a(LYg/s;LIf/a;)LYg/s;

    move-result-object p1

    return-object p1
.end method
