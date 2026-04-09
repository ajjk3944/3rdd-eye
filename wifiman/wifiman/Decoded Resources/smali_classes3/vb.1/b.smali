.class public final synthetic Lvb/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/q;


# instance fields
.field public final synthetic a:Lvb/c;

.field public final synthetic b:Lgg/z;


# direct methods
.method public synthetic constructor <init>(Lvb/c;Lgg/z;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvb/b;->a:Lvb/c;

    iput-object p2, p0, Lvb/b;->b:Lgg/z;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lvb/b;->a:Lvb/c;

    iget-object v1, p0, Lvb/b;->b:Lgg/z;

    invoke-static {v0, v1}, Lvb/c;->b(Lvb/c;Lgg/z;)Lgg/D;

    move-result-object v0

    return-object v0
.end method
