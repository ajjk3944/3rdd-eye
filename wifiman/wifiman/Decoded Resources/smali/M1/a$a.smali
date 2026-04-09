.class LM1/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM1/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Landroid/graphics/Rect;)V
    .locals 0

    check-cast p1, LG1/t;

    invoke-virtual {p0, p1, p2}, LM1/a$a;->b(LG1/t;Landroid/graphics/Rect;)V

    return-void
.end method

.method public b(LG1/t;Landroid/graphics/Rect;)V
    .locals 0

    invoke-virtual {p1, p2}, LG1/t;->k(Landroid/graphics/Rect;)V

    return-void
.end method
