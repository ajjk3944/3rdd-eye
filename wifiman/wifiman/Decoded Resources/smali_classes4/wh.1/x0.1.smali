.class Lwh/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:Lwh/y0;


# direct methods
.method public constructor <init>(Lwh/y0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwh/x0;->a:Lwh/y0;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lwh/x0;->a:Lwh/y0;

    invoke-static {v0}, Lwh/y0;->e(Lwh/y0;)Ljava/lang/reflect/Type;

    move-result-object v0

    return-object v0
.end method
