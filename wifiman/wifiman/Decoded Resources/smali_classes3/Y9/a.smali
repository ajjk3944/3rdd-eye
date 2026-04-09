.class public final synthetic LY9/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:LY9/k;

.field public final synthetic b:Z

.field public final synthetic c:I

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(LY9/k;ZII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LY9/a;->a:LY9/k;

    iput-boolean p2, p0, LY9/a;->b:Z

    iput p3, p0, LY9/a;->c:I

    iput p4, p0, LY9/a;->d:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, LY9/a;->a:LY9/k;

    iget-boolean v1, p0, LY9/a;->b:Z

    iget v2, p0, LY9/a;->c:I

    iget v3, p0, LY9/a;->d:I

    move-object v4, p1

    check-cast v4, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static/range {v0 .. v5}, LY9/i;->c(LY9/k;ZIILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
