.class public final synthetic LU9/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroid/app/Activity;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lf2/w;

.field public final synthetic d:LN/n0;

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Ljava/lang/String;Lf2/w;LN/n0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU9/q;->a:Landroid/app/Activity;

    iput-object p2, p0, LU9/q;->b:Ljava/lang/String;

    iput-object p3, p0, LU9/q;->c:Lf2/w;

    iput-object p4, p0, LU9/q;->d:LN/n0;

    iput p5, p0, LU9/q;->e:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, LU9/q;->a:Landroid/app/Activity;

    iget-object v1, p0, LU9/q;->b:Ljava/lang/String;

    iget-object v2, p0, LU9/q;->c:Lf2/w;

    iget-object v3, p0, LU9/q;->d:LN/n0;

    iget v4, p0, LU9/q;->e:I

    move-object v5, p1

    check-cast v5, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, LU9/y;->l(Landroid/app/Activity;Ljava/lang/String;Lf2/w;LN/n0;ILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
