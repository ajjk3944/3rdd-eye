.class public final synthetic Lxe/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Lxe/r0;

.field public final synthetic b:Lf2/w;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lxe/r0;Lf2/w;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxe/w;->a:Lxe/r0;

    iput-object p2, p0, Lxe/w;->b:Lf2/w;

    iput p3, p0, Lxe/w;->c:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lxe/w;->a:Lxe/r0;

    iget-object v1, p0, Lxe/w;->b:Lf2/w;

    iget v2, p0, Lxe/w;->c:I

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, v2, p1, p2}, Lxe/B;->i(Lxe/r0;Lf2/w;ILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
