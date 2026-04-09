.class final Ltb/N$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltb/N;-><init>(Ljava/util/List;Ljava/lang/String;Lpb/l;Llb/c;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ltb/N;


# direct methods
.method constructor <init>(Ltb/N;)V
    .locals 0

    iput-object p1, p0, Ltb/N$j;->a:Ltb/N;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ltb/f;)Lgg/v;
    .locals 0

    iget-object p1, p0, Ltb/N$j;->a:Ltb/N;

    invoke-static {p1}, Ltb/N;->w(Ltb/N;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ltb/f;

    invoke-virtual {p0, p1}, Ltb/N$j;->a(Ltb/f;)Lgg/v;

    move-result-object p1

    return-object p1
.end method
