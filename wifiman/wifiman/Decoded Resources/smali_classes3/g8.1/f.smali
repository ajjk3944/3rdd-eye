.class public final synthetic Lg8/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lg8/l;


# direct methods
.method public synthetic constructor <init>(Lg8/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg8/f;->a:Lg8/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lg8/f;->a:Lg8/l;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, p1}, Lg8/l;->g1(Lg8/l;Ljava/util/List;)LYg/J;

    move-result-object p1

    return-object p1
.end method
