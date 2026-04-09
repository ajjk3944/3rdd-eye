.class LP6/E$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/w;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP6/E;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lgg/s;)Lgg/s;
    .locals 0

    return-object p1
.end method

.method public bridge synthetic b(Lgg/s;)Lgg/v;
    .locals 0

    invoke-virtual {p0, p1}, LP6/E$a;->a(Lgg/s;)Lgg/s;

    move-result-object p1

    return-object p1
.end method
