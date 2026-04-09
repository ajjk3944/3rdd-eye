.class public final Lo6/d$a;
.super Lph/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo6/d;-><init>(Lo6/c;ILr6/b;Lw6/b;FI)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo6/d;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lo6/d;)V
    .locals 0

    iput-object p2, p0, Lo6/d$a;->b:Lo6/d;

    invoke-direct {p0, p1}, Lph/b;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method protected c(Lth/l;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    const-string/jumbo v0, "property"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p1

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    iget-object p2, p0, Lo6/d$a;->b:Lo6/d;

    invoke-static {p2}, Lo6/d;->c(Lo6/d;)Landroid/graphics/Paint;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method
