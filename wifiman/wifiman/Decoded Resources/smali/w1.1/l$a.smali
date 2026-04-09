.class public Lw1/l$a;
.super LB1/k$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw1/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Lv1/h$e;


# direct methods
.method public constructor <init>(Lv1/h$e;)V
    .locals 0

    invoke-direct {p0}, LB1/k$c;-><init>()V

    iput-object p1, p0, Lw1/l$a;->a:Lv1/h$e;

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    iget-object v0, p0, Lw1/l$a;->a:Lv1/h$e;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lv1/h$e;->h(I)V

    :cond_0
    return-void
.end method

.method public b(Landroid/graphics/Typeface;)V
    .locals 1

    iget-object v0, p0, Lw1/l$a;->a:Lv1/h$e;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lv1/h$e;->i(Landroid/graphics/Typeface;)V

    :cond_0
    return-void
.end method
