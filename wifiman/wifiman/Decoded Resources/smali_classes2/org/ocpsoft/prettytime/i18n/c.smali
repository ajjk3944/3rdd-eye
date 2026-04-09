.class public final synthetic Lorg/ocpsoft/prettytime/i18n/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic a:Lorg/ocpsoft/prettytime/i18n/Resources_ja;


# direct methods
.method public synthetic constructor <init>(Lorg/ocpsoft/prettytime/i18n/Resources_ja;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/ocpsoft/prettytime/i18n/c;->a:Lorg/ocpsoft/prettytime/i18n/Resources_ja;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lorg/ocpsoft/prettytime/i18n/c;->a:Lorg/ocpsoft/prettytime/i18n/Resources_ja;

    check-cast p1, LAj/g;

    invoke-static {v0, p1}, Lorg/ocpsoft/prettytime/i18n/Resources_ja;->b(Lorg/ocpsoft/prettytime/i18n/Resources_ja;LAj/g;)LAj/f;

    move-result-object p1

    return-object p1
.end method
