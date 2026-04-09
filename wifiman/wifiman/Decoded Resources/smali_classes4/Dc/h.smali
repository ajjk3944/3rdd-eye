.class public final synthetic LDc/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:LDc/j;


# direct methods
.method public synthetic constructor <init>(LDc/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDc/h;->a:LDc/j;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LDc/h;->a:LDc/j;

    invoke-static {v0}, LDc/j;->s(LDc/j;)Ljava/util/TreeSet;

    move-result-object v0

    return-object v0
.end method
