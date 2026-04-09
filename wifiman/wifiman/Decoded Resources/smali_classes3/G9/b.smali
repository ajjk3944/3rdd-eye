.class public final synthetic LG9/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Lz/Y;

.field public final synthetic b:Z

.field public final synthetic c:Lmh/a;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Lz/Y;ZLmh/a;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LG9/b;->a:Lz/Y;

    iput-boolean p2, p0, LG9/b;->b:Z

    iput-object p3, p0, LG9/b;->c:Lmh/a;

    iput p4, p0, LG9/b;->d:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, LG9/b;->a:Lz/Y;

    iget-boolean v1, p0, LG9/b;->b:Z

    iget-object v2, p0, LG9/b;->c:Lmh/a;

    iget v3, p0, LG9/b;->d:I

    move-object v4, p1

    check-cast v4, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static/range {v0 .. v5}, LG9/c;->a(Lz/Y;ZLmh/a;ILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
