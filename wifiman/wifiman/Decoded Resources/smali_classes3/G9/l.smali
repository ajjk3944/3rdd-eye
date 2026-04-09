.class public final synthetic LG9/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Ls9/b;

.field public final synthetic b:I

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Ls9/b;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LG9/l;->a:Ls9/b;

    iput p2, p0, LG9/l;->b:I

    iput p3, p0, LG9/l;->c:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LG9/l;->a:Ls9/b;

    iget v1, p0, LG9/l;->b:I

    iget v2, p0, LG9/l;->c:I

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, v2, p1, p2}, LG9/m;->a(Ls9/b;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
