.class public LG6/E;
.super Lgg/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LG6/E$b;
    }
.end annotation


# instance fields
.field private final a:Lgg/s;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Lgg/s;-><init>()V

    new-instance v0, LG6/E$a;

    invoke-direct {v0, p0, p1}, LG6/E$a;-><init>(LG6/E;Landroid/content/Context;)V

    invoke-static {v0}, Lgg/s;->o(Lgg/u;)Lgg/s;

    move-result-object p1

    invoke-static {}, LGg/a;->f()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/s;->M0(Lgg/y;)Lgg/s;

    move-result-object p1

    invoke-static {}, LGg/a;->f()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/s;->e1(Lgg/y;)Lgg/s;

    move-result-object p1

    invoke-virtual {p1}, Lgg/s;->D0()Lgg/s;

    move-result-object p1

    iput-object p1, p0, LG6/E;->a:Lgg/s;

    return-void
.end method

.method static i1(I)LG6/E$b;
    .locals 0

    packed-switch p0, :pswitch_data_0

    sget-object p0, LG6/E$b;->d:LG6/E$b;

    return-object p0

    :pswitch_0
    sget-object p0, LG6/E$b;->f:LG6/E$b;

    return-object p0

    :pswitch_1
    sget-object p0, LG6/E$b;->c:LG6/E$b;

    return-object p0

    :pswitch_2
    sget-object p0, LG6/E$b;->e:LG6/E$b;

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0xb
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method protected L0(Lgg/x;)V
    .locals 1

    iget-object v0, p0, LG6/E;->a:Lgg/s;

    invoke-virtual {v0, p1}, Lgg/s;->d(Lgg/x;)V

    return-void
.end method
