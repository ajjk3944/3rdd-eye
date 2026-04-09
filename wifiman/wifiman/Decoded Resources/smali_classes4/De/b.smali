.class public final synthetic LDe/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Z

.field public final synthetic c:Ls9/d;

.field public final synthetic d:I

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(JZLs9/d;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, LDe/b;->a:J

    iput-boolean p3, p0, LDe/b;->b:Z

    iput-object p4, p0, LDe/b;->c:Ls9/d;

    iput p5, p0, LDe/b;->d:I

    iput p6, p0, LDe/b;->e:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-wide v0, p0, LDe/b;->a:J

    iget-boolean v2, p0, LDe/b;->b:Z

    iget-object v3, p0, LDe/b;->c:Ls9/d;

    iget v4, p0, LDe/b;->d:I

    iget v5, p0, LDe/b;->e:I

    move-object v6, p1

    check-cast v6, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, LDe/c;->a(JZLs9/d;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
