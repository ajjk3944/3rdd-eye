.class public final synthetic Lhf/F;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Lz/f;

.field public final synthetic b:Lhf/t$c;


# direct methods
.method public synthetic constructor <init>(Lz/f;Lhf/t$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhf/F;->a:Lz/f;

    iput-object p2, p0, Lhf/F;->b:Lhf/t$c;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lhf/F;->a:Lz/f;

    iget-object v1, p0, Lhf/F;->b:Lhf/t$c;

    check-cast p1, LC0/U;

    check-cast p2, LY0/b;

    invoke-static {v0, v1, p1, p2}, Lhf/J$a;->b(Lz/f;Lhf/t$c;LC0/U;LY0/b;)LC0/D;

    move-result-object p1

    return-object p1
.end method
