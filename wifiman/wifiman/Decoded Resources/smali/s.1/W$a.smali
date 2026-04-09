.class public Ls/W$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls/U;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls/W;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final a:Landroid/widget/Magnifier;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/widget/Magnifier;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls/W$a;->a:Landroid/widget/Magnifier;

    return-void
.end method


# virtual methods
.method public a(JJF)V
    .locals 0

    iget-object p3, p0, Ls/W$a;->a:Landroid/widget/Magnifier;

    invoke-static {p1, p2}, Ll0/g;->m(J)F

    move-result p4

    invoke-static {p1, p2}, Ll0/g;->n(J)F

    move-result p1

    invoke-virtual {p3, p4, p1}, Landroid/widget/Magnifier;->show(FF)V

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Ls/W$a;->a:Landroid/widget/Magnifier;

    invoke-virtual {v0}, Landroid/widget/Magnifier;->update()V

    return-void
.end method

.method public final c()Landroid/widget/Magnifier;
    .locals 1

    iget-object v0, p0, Ls/W$a;->a:Landroid/widget/Magnifier;

    return-object v0
.end method

.method public dismiss()V
    .locals 1

    iget-object v0, p0, Ls/W$a;->a:Landroid/widget/Magnifier;

    invoke-virtual {v0}, Landroid/widget/Magnifier;->dismiss()V

    return-void
.end method

.method public h()J
    .locals 2

    iget-object v0, p0, Ls/W$a;->a:Landroid/widget/Magnifier;

    invoke-virtual {v0}, Landroid/widget/Magnifier;->getWidth()I

    move-result v0

    iget-object v1, p0, Ls/W$a;->a:Landroid/widget/Magnifier;

    invoke-virtual {v1}, Landroid/widget/Magnifier;->getHeight()I

    move-result v1

    invoke-static {v0, v1}, LY0/s;->a(II)J

    move-result-wide v0

    return-wide v0
.end method
