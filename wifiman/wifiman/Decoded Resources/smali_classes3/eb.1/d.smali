.class public final synthetic Leb/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/a;


# instance fields
.field public final synthetic a:Leb/m;


# direct methods
.method public synthetic constructor <init>(Leb/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leb/d;->a:Leb/m;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Leb/d;->a:Leb/m;

    invoke-static {v0}, Leb/c$k;->a(Leb/m;)V

    return-void
.end method
