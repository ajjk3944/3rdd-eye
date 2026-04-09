.class public final synthetic Lhb/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lhb/c;


# direct methods
.method public synthetic constructor <init>(Lhb/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhb/d;->a:Lhb/c;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lhb/d;->a:Lhb/c;

    check-cast p1, Leb/i$a;

    invoke-static {v0, p1}, Lhb/c$g$a;->a(Lhb/c;Leb/i$a;)LYg/J;

    move-result-object p1

    return-object p1
.end method
