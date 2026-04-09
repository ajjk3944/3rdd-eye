.class public final synthetic Lhd/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# instance fields
.field public final synthetic a:Lhd/c;


# direct methods
.method public synthetic constructor <init>(Lhd/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhd/b;->a:Lhd/c;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lhd/b;->a:Lhd/c;

    check-cast p1, Lhd/c$a;

    check-cast p2, Lhd/c$a;

    invoke-static {v0, p1, p2}, Lhd/c;->c(Lhd/c;Lhd/c$a;Lhd/c$a;)Lhd/c$a;

    move-result-object p1

    return-object p1
.end method
