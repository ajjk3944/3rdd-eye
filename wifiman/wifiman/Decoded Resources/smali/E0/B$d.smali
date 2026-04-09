.class final LE0/B$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE0/g0$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE0/B;->r(LC0/o;LC0/n;I)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LE0/B;


# direct methods
.method constructor <init>(LE0/B;)V
    .locals 0

    iput-object p1, p0, LE0/B$d;->a:LE0/B;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;
    .locals 1

    iget-object v0, p0, LE0/B$d;->a:LE0/B;

    invoke-interface {v0, p1, p2, p3, p4}, LE0/B;->b(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;

    move-result-object p1

    return-object p1
.end method
