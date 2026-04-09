.class Ldi/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field private final a:Lkotlin/reflect/jvm/internal/impl/builtins/l;


# direct methods
.method public constructor <init>(Lkotlin/reflect/jvm/internal/impl/builtins/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldi/h;->a:Lkotlin/reflect/jvm/internal/impl/builtins/l;

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ldi/h;->a:Lkotlin/reflect/jvm/internal/impl/builtins/l;

    check-cast p1, LBh/G;

    invoke-static {v0, p1}, Ldi/i;->a(Lkotlin/reflect/jvm/internal/impl/builtins/l;LBh/G;)Lpi/S;

    move-result-object p1

    return-object p1
.end method
