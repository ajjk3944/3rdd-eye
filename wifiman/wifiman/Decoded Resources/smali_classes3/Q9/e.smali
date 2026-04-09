.class public final synthetic LQ9/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroid/app/Activity;

.field public final synthetic b:Lmh/a;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lmh/a;

.field public final synthetic e:Lf2/w;

.field public final synthetic f:Lmh/q;

.field public final synthetic g:I

.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Lmh/a;Ljava/lang/String;Lmh/a;Lf2/w;Lmh/q;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQ9/e;->a:Landroid/app/Activity;

    iput-object p2, p0, LQ9/e;->b:Lmh/a;

    iput-object p3, p0, LQ9/e;->c:Ljava/lang/String;

    iput-object p4, p0, LQ9/e;->d:Lmh/a;

    iput-object p5, p0, LQ9/e;->e:Lf2/w;

    iput-object p6, p0, LQ9/e;->f:Lmh/q;

    iput p7, p0, LQ9/e;->g:I

    iput p8, p0, LQ9/e;->h:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, LQ9/e;->a:Landroid/app/Activity;

    iget-object v1, p0, LQ9/e;->b:Lmh/a;

    iget-object v2, p0, LQ9/e;->c:Ljava/lang/String;

    iget-object v3, p0, LQ9/e;->d:Lmh/a;

    iget-object v4, p0, LQ9/e;->e:Lf2/w;

    iget-object v5, p0, LQ9/e;->f:Lmh/q;

    iget v6, p0, LQ9/e;->g:I

    iget v7, p0, LQ9/e;->h:I

    move-object v8, p1

    check-cast v8, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, LQ9/h;->b(Landroid/app/Activity;Lmh/a;Ljava/lang/String;Lmh/a;Lf2/w;Lmh/q;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
