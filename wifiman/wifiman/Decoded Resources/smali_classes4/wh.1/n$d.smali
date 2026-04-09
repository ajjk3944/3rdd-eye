.class public final Lwh/n$d;
.super Lwh/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwh/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field private final a:LYh/d$b;

.field private final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(LYh/d$b;)V
    .locals 1

    const-string v0, "signature"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lwh/n;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lwh/n$d;->a:LYh/d$b;

    invoke-virtual {p1}, LYh/d$b;->a()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lwh/n$d;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lwh/n$d;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lwh/n$d;->a:LYh/d$b;

    invoke-virtual {v0}, LYh/d$b;->d()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
