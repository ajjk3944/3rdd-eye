.class public final Lv7/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv7/g;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lgg/y;)Lv7/e;
    .locals 1

    const-string/jumbo v0, "scheduler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lv7/j;

    invoke-direct {v0, p1}, Lv7/j;-><init>(Lgg/y;)V

    return-object v0
.end method
