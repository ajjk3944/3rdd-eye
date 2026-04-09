.class public final synthetic LUe/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Long;

.field public final synthetic d:Lmh/a;

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Long;Lmh/a;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LUe/e;->a:I

    iput p2, p0, LUe/e;->b:I

    iput-object p3, p0, LUe/e;->c:Ljava/lang/Long;

    iput-object p4, p0, LUe/e;->d:Lmh/a;

    iput p5, p0, LUe/e;->e:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, LUe/e;->a:I

    iget v1, p0, LUe/e;->b:I

    iget-object v2, p0, LUe/e;->c:Ljava/lang/Long;

    iget-object v3, p0, LUe/e;->d:Lmh/a;

    iget v4, p0, LUe/e;->e:I

    move-object v5, p1

    check-cast v5, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, LUe/f;->a(IILjava/lang/Long;Lmh/a;ILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
